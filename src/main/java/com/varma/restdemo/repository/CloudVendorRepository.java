package com.varma.restdemo.repository;

import com.varma.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
