package projekt.psk.wypozyczalnia.msgModule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.psk.wypozyczalnia.msgModule.models.Msg;
import projekt.psk.wypozyczalnia.msgModule.services.MsgService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/msg")
public class MsgController {

    @Autowired
    MsgService msgService;

    @PostMapping("/add")
    public String saveMsg(@RequestBody Msg msg) {
        return this.msgService.saveMsg(msg);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateMsg(@PathVariable(value="id", required=true) String id, @RequestBody Msg msg){
        this.msgService.updateMsg(msg, id);
        return ResponseEntity.ok("Zaktualizowano pomyślnie");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMsg(@PathVariable(value="id", required=true) String id){
        this.msgService.deleteMsg(id);
        return ResponseEntity.ok("Auto zostało usunięta");
    }

    @GetMapping("/get/{id}")
    public Optional<Msg> getMsg(@PathVariable(value="id", required=true) String id){
        return this.msgService.getMsg(id);
    }

    @GetMapping("/get")
    public List<Msg> getAllMsg() {
        return this.msgService.getAllMsg();
    }

    @GetMapping("/get-owned/{id}")
    public List<Msg> getAllOwnedMsg(@PathVariable(value="id", required=true) String id) {
        return this.msgService.getAllOwnedMsg(id);
    }


}
