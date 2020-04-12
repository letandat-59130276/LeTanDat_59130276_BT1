/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import interfaces.IQLDS;
import java.util.ArrayList;
/**
 *
 * @author Con Meo Cutee
 */
public class QLDS implements IQLDS {
    private ArrayList<CaNhan> ds = new ArrayList<>();

    public ArrayList<CaNhan> getDs() {
        return ds;
    }

    public void setDs(ArrayList<CaNhan> ds) {
        this.ds = ds;
    }

    public int them(CaNhan caNhan) {
        for(int i=0;i<ds.size();i++){
            if(ds.get(i).equals(caNhan)){
                return 0;
            }
        }
        ds.add(caNhan);
        return 1;

    }

    public int xoa(String ten) {
        if (ds.isEmpty()) {
            return 0;
        } else {
            int j = -1;
            for (int i = 0; i < ds.size(); i++) {
                if (ten.equals(ds.get(i).getHoten())) {
                    j = i;
                    break;
                }
            }
            if (j > -1) {
                ds.remove(j);
                return 1;
            } else return 0;
        }
    }

    public void inDS(ArrayList<CaNhan> ds) {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i).hienThiTT());
        }
    }
}
