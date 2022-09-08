package br.com.bennytech.relatorioDeVendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bennytech.relatorioDeVendas.entities.Sale;
import br.com.bennytech.relatorioDeVendas.repository.SaleRepository;


@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}
}
