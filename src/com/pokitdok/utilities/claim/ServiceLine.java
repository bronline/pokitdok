/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pokitdok.utilities.claim;

import java.util.ArrayList;

/**
 *
 * @author Randy
 */
public class ServiceLine {
    public String procedure_code;
    public double charge_amount;
    public double unit_count;
    public ArrayList<String> diagnosis_codes = new ArrayList<String>();
    public String service_date;
}
