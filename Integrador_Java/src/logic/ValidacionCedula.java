/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author davidpulloquinga
 */
public class ValidacionCedula {
    private   boolean cedulaCorrecta = false;
    private int verificador,suma,digito;
    public boolean validadorDeCedula(String cedula) {
  

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    verificador = Integer.parseInt(cedula.substring(9, 10));
                    suma = 0;
                    digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = coefValCedula[i] * Integer.parseInt(cedula.substring(i, i + 1));
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else cedulaCorrecta = (10 - (suma % 10)) == verificador;
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception e) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cedula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }
}
