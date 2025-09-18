package com.varma.restdemo.repository;

import com.varma.restdemo.model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class CloudVendorRespositoryTest {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;
    CloudVendor cloudVendor;

    @BeforeEach
    void setUp() {
        cloudVendor= new CloudVendor("1","Amazon","USA", "XXXXX");
        cloudVendorRepository.save(cloudVendor);
    }

    @AfterEach
    void tearDown() {
        cloudVendor = null;
        cloudVendorRepository.deleteAll();
    }

    //Test

    @Test
    void testFindByVendorName_Found()
    {
        List<CloudVendor> CloudVendorList = cloudVendorRepository.findByVendorName("Amazon");
        assertThat(CloudVendorList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(CloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
    }

    @Test
    void testFindByVendorName_NotFound()
    {
        List<CloudVendor> CloudVendorList= cloudVendorRepository.findByVendorName("Google");
        assertThat(CloudVendorList.isEmpty()).isTrue();
    }

}
