package projekt.psk.wypozyczalnia.msgModule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.psk.wypozyczalnia.msgModule.models.Msg;
import projekt.psk.wypozyczalnia.msgModule.repositories.MsgRepository;

import java.util.*;
import java.util.stream.Stream;

@Service
public class MsgService {
    @Autowired
    MsgRepository msgRepository;


    public String saveMsg(Msg msg){
       return this.msgRepository.save(msg).getId();
    }
    public void deleteMsg(String id){
        this.msgRepository.deleteById(id);
    }

    public void updateMsg(Msg newMsg, String id){
        Optional<Msg> message = this.msgRepository.findById(id);
        message.ifPresent(msg -> {
            if(newMsg.getUsername() != null){
                msg.setUsername(newMsg.getUsername());
            }
            if(newMsg.getOwnerId() != null){
                msg.setOwnerId(newMsg.getOwnerId());
            }
            if(newMsg.getEmail() != null){
                msg.setEmail(newMsg.getEmail());
            }
            if(newMsg.getSubject() != null){
                msg.setSubject(newMsg.getSubject());
            }
            if(newMsg.getUserMessage() != null) {
                msg.getUserMessage();
                String[] first = msg.getUserMessage();
                String[] second = newMsg.getUserMessage();
                String[] connect= Stream.concat(Arrays.stream(first), Arrays.stream(second)).toArray(String[]::new);
                msg.setUserMessage(connect);
            }
            if(newMsg.getAdminMessage() != null) {
                msg.getAdminMessage();
                String[] first = msg.getAdminMessage();
                String[] second = newMsg.getAdminMessage();
                String[] connect= Stream.concat(Arrays.stream(first), Arrays.stream(second)).toArray(String[]::new);
                msg.setAdminMessage(connect);
            }
            if(newMsg.getOption() != null) {
                msg.setOption(newMsg.getOption());
            }
            this.msgRepository.save(msg);
        });
    }

    public List<Msg> getAllMsg(){
        return this.msgRepository.findAll();
    }

    public List<Msg> getAllOwnedMsg(String id){
        return this.msgRepository.findByOwnerId(id);
    }





    public Optional<Msg> getMsg(String id){
        return this.msgRepository.findById(id);
    }




    }


