package feladat03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;

public class VizsgaztatoApp {

	public static void main(String[] args) throws IOException {
		
		AdatKezeles adatObj = new AdatKezeles();
		
		Map<String, Vizsgazo> vizsgazok = adatObj.adatBekeres();
		
		for (Map.Entry<String, Vizsgazo> vizsgazo: vizsgazok.entrySet()) {
			System.out.println(vizsgazo.getKey()+" "+ vizsgazo.getValue().toString());
			
			
			
		}
		String intezmenyNeve;
		Scanner sc=new Scanner(System.in);
		System.out.println("Adja meg a keresett intézmény nevét:");
		intezmenyNeve=sc.nextLine();
		
		
		boolean Profisuli=profiSuli(vizsgazok,intezmenyNeve);
		
		if(Profisuli) {
			System.out.println("Érkezett tanuló a "+ intezmenyNeve+" intézméynből");	
			
			} else {
				System.out.println("Nem érkezett tanuló a "+ intezmenyNeve+" intézméynből");	
			};
		

		
		
	}

	public static boolean profiSuli(Map<String, Vizsgazo> vizsgazok, String intezmenyNeve) {
		
		for (Map.Entry<String, Vizsgazo> vizsgazo: vizsgazok.entrySet()) {
		if(vizsgazo.getValue().getKepzoIntezmeny().equals(intezmenyNeve)) {
			return true;
			};
		
		}
		
		return false;
	}
	

}
