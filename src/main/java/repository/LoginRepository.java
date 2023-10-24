/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataacess.LoginDAO;
import java.util.Locale;


public class LoginRepository implements ILoginRepository{

    @Override
    public void login(Locale language) {
        LoginDAO.Instance().login(language);
    }
}
