/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import BaiTap1.CaNhan;
import java.util.ArrayList;

/**
 *
 * @author Con Meo Cutee
 */
public interface IQLDS {
    public int them(CaNhan caNhan);
    public int xoa(String ten);
    public void inDS(ArrayList<CaNhan> ds);
}
