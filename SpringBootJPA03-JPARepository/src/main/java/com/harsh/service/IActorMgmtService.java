package com.harsh.service;

import org.springframework.data.domain.Page;

import com.harsh.entity.Actor;

public interface IActorMgmtService {

	public Iterable<Actor> showAllActorBySorting(boolean ascOrder, String... props);

	public Page<Actor> showActorsByPageNo(int pageNo, int size);
	
	public Page<Actor> showActorsByPageNoAndSorted(int pageNo, int size,boolean ascOrder, String... props);
	
	public void showActorsByPagination(int pageSize);
}
