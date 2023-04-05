package edu.comillas.icai.pat.ejemplopat.service.impl;
import org.springframework.stereotype.Service;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import edu.comillas.icai.pat.ejemplopat.dto.Persona;



@Service
public class MyServiceImpl implements MyService {

	@Override
	public String getInfo(Persona persona) {
		String responseGetInfo="Servicio OK! - " ;
		return responseGetInfo;
	}

}
