/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthtd.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author DAI
 */
public class Worker extends Person{
    private String cty;
    
    public Worker() {
    }

    public Worker(String cty, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.cty = cty;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }
    
}
