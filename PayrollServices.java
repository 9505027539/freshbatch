package com.cg.payroll.services;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.InValidAssociateIDException;
import com.cg.payroll.exceptions.PayRollServicesNotFoundException;

public interface PayrollServices {

	int acceptCustomerDetails(String associateName, String emailId,
			String panCard, int basicSalary, int pf, int comapnyPf,
			int investment) throws PayRollServicesNotFoundException;

	int calculateMonthlyNetSalary(int associateId)
			throws InValidAssociateIDException,
			AssociateDetailsNotFoundException, PayRollServicesNotFoundException;

	Associate getAssociateDetails(int associateId)
			throws InValidAssociateIDException,
			AssociateDetailsNotFoundException;

	ArrayList<Associate> getAllAssociateDetails()
			throws PayRollServicesNotFoundException;

	boolean closePayrollServices() throws PayRollServicesNotFoundException;

}