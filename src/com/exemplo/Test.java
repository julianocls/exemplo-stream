package com.exemplo;

import java.util.List;

import com.exemplo.dao.FaturaDAO;
import com.exemplo.model.Fatura;

public class Test {

	public static void main(String[] args) {

		List<Fatura> faturas = new FaturaDAO().buscarFaturas();
		
//		for(Fatura f : faturas) {
//			if(f.getValor() > 400) {
//				System.out.println(f.getValor());
//			}
//		}

		//faturas.stream().filter(f -> f.getValor() > 400).forEach(f -> System.out.println(f));
		//faturas.stream().filter(f -> f.getValor() > 400).forEach(System.out::println);
		faturas.stream().filter(Fatura::faturaEmRisco).forEach(System.out::println);


	}
}
