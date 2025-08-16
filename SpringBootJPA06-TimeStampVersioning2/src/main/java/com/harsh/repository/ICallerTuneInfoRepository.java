package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.CallerTuneInfo;

public interface ICallerTuneInfoRepository extends JpaRepository<CallerTuneInfo, Integer> {

}
