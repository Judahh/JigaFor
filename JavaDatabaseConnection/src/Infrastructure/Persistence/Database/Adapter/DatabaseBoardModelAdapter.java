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
public interface DatabaseBoardModelAdapter {
    public int getIntIdentification();
    public void setIntIdentification(int intIdentification);
    
    public String getVarchar50Name();
    public void setVarchar50Name(String varchar50Name);
    
    public List<DatabaseProbeAdapter> getListProbe();
    public List<DatabaseInputSignalAdapter> getListInputSignal();
}
