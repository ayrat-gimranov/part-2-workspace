package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee = new SalariedEmployee("Ayrat", new Date(0), 1000.0);
  }

  @Test
  public void pay() {
    assertEquals(1000.0, employee.pay(), 0.005);
  }

  @Test
  public void payTaxes() {
    assertEquals(1000 * TaxPayer.SALARIED_TAX_RATE, employee.payTaxes(), 0.005);
  }
}