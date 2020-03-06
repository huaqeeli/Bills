/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bills;

import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ابو ريان
 */
public class NewClass {
  public static void main(String[] args){
      try {
          Connection con = ConnecationDB.dbConnector();
      } catch (IOException ex) {
          Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
      }
  }  
}
