package projekt.psk.wypozyczalnia;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projekt.psk.wypozyczalnia.fileModule.repositories.FilesStorageService;


@SpringBootApplication
public class WypozyczalniaAppApplication implements CommandLineRunner {
	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(WypozyczalniaAppApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		//storageService.deleteAll();
		//storageService.init();
	}

}
