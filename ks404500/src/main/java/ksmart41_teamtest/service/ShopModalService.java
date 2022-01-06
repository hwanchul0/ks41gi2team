package ksmart41_teamtest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart41_teamtest.dto.ShopModal;
import ksmart41_teamtest.mapper.ServiceRequestMapper;
import ksmart41_teamtest.mapper.ShopModalMapper;
@Service
@Transactional
public class ShopModalService {
	
	private ShopModalMapper shopModalMapper;

	public ShopModalService(ShopModalMapper shopModalMapper) {
		this.shopModalMapper = shopModalMapper;
		}

	public List<ShopModal> getRequestModal() {
		List<ShopModal> getRequestModal = shopModalMapper.getRequestModal();
		return getRequestModal;
	}

}
