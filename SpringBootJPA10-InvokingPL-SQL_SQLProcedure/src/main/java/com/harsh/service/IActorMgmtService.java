package com.harsh.service;

import java.util.List;

import com.harsh.entity.Actor;

public interface IActorMgmtService {
     public List<Actor>  showActorsByCategories(String cat1,String cat2,String cat3);
}
