package com.varma.restdemo.service;

import com.varma.restdemo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendorDetails(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendorDetails();
}
