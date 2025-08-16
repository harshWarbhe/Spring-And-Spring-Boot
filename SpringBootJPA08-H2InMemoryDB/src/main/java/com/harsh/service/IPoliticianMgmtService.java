package com.harsh.service;

import com.harsh.entity.Politician;

public interface IPoliticianMgmtService {
  public  String  registerPolitician(Politician  pltcn);
  public   Politician  showPoliticianById(int id);
  public  Iterable<Politician> showAllPoliticians();
}
