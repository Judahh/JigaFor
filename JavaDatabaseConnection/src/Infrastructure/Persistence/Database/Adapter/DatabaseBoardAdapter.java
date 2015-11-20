/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infrastructure.Persistence.Database.Adapter;

import java.util.List;

/**
 *
 * @author Judah
 */
public interface DatabaseBoardAdapter {
    public int getIntIdentification();
    public void setIntIdentification(int intIdentification);
    
    public int getIntBarcode();
    public void setIntBarcode(int intBarcode);
    
    public DatabaseBoardModelAdapter getBoardModel();
    
    public List<DatabaseUserAdapter> getListUser();
    public List<DatabaseProbeResultAdapter> getListProbeResult();
    public List<DatabaseProbeResultMaintenceAdapter> getListProbeResultMaintence();
}
