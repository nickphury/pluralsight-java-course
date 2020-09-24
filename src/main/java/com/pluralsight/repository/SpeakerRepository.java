package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    public List<Speaker> findAll();
}
