/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infrastructure.Persistence.Database.Adapter;

import Infrastructure.Persistence.Database.Adapter.DatabaseBoardAdapter;
import java.util.List;

import Shared.UserAdapter;

/**
 *
 * @author Judah
 */
public interface DatabaseUserAdapter extends UserAdapter{
    public int getIntIdentification();
    public void setIntIdentification(int intIdentification);
    
    public String getVarchar100Name();
    public void setVarchar100Name(String varchar100Name);
   
    public String getVarchar25Username();
    public void setVarchar25Username(String varchar25Username);
    
    public String getVarchar25Password();
    public void setVarchar25Password(String varchar25Password);
    
    public int getTinyintPermission();
    public void setTinyintPermission(int tinyintPermission);
    
    public List<DatabaseBoardAdapter> getListBoard();
}
