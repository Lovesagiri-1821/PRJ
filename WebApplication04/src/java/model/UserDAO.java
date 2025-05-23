/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class UserDAO {
    ArrayList<UserDTO> list;

    public UserDAO() {
        this.list = new ArrayList<>();
        list.add(new UserDTO("admin", "Adminitrator", "1", "AD", true));
        list.add(new UserDTO("se19000", "Tran Manh Hung", "hcm", "MB", true));
    }
    public boolean login(String userID, String password){
        for (UserDTO userDTO : list) {
            if (userDTO.getUserID().equalsIgnoreCase(userID)
            && userDTO.getPassword().equals(password))
                    {
                return true;
            }
        }
        return false;
    }
    public UserDTO getUserByID(String userID){
        for (UserDTO userDTO : list) {
            if (userDTO.getUserID().equalsIgnoreCase(userID)) {
                return userDTO;
            }
        }
        return null;
    }
    
    
}
