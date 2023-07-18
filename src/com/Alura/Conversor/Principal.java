package com.Alura.Conversor;

import javax.swing.*;



public class Principal {
    public static void main(String[] args) {
    	
    	Principal msg = new Principal();
    	msg.mensaje();
    	
    }
    
    public Icon icono1 (String path, int width, int heigth) {
    	Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
    	return img;
    }
    
    public void mensaje () {
    	
    	double resultado;
    	float numConversion;
    	
    	String conversor = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
    			"Menu", JOptionPane.PLAIN_MESSAGE,icono1("Pulpo.png",150,150), new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},
    			"Selecciona")).toString();
    	
    	if (conversor == "Conversor de Moneda") {
    		
    		try {
    			numConversion = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir", "Menu", JOptionPane.PLAIN_MESSAGE));
    			String conversor2 = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
    	    			"Menu", JOptionPane.PLAIN_MESSAGE,icono1("Pulpo.png",150,150), new Object[] {"De Soles a Dolar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yenes", "De Soles a Wones Coreanos", 
    	    					"De Dolar a Soles", "De Euro a Soles","De Libras a Soles", "De Yenes a Soles", "De Wones Coreanos a Soles" },
    	    			"Selecciona")).toString();
    	
    			if (conversor2 == "De Soles a Dolar") {
    				resultado = Math.round((numConversion / 3.63) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes $ "+ resultado + " Dolares."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    				
    			}if (conversor2 == "De Soles a Euro") {
    				resultado = Math.round((numConversion / 3.99) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes € "+ resultado + " Euros."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Soles a Libras") {
    				resultado = Math.round((numConversion / 4.69) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes £ "+ resultado + " Libras."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Soles a Yenes") {
    				resultado = Math.round((numConversion / 0.026) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes ¥ "+ resultado + " Yenes."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Soles a Wones Coreanos") {
    				resultado = Math.round((numConversion / 0.0028) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes ₩ "+ resultado + " Wones Coreanos."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Dolar a Soles") {
    				resultado = Math.round((numConversion * 3.63) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes S/ "+ resultado + " Soles."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Euro a Soles") {
    				resultado = Math.round((numConversion * 3.99) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes S/ "+ resultado + " Soles."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Libras a Soles") {
    				resultado = Math.round((numConversion * 4.69) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes S/ "+ resultado + " Soles."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Yenes a Soles") {
    				resultado = Math.round((numConversion * 0.026) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes S/ "+ resultado + " Soles."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}if (conversor2 == "De Wones Coreanos a Soles") {
    				resultado = Math.round((numConversion * 0.0028) * 100.0) / 100.0;
    				JOptionPane.showMessageDialog(null,new JLabel(("Tienes S/ "+ resultado + " Soles."),JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    			}
    			
    		}catch (Exception e){
    			JOptionPane.showMessageDialog(null,new JLabel("Error. Ingrese un numero.", JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
    		}
			
		}if (conversor == "Conversor de Temperatura") {
			
			try {
				numConversion = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la temperatura que deseas convertir", "Menu", JOptionPane.PLAIN_MESSAGE));
				String conversor2 = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
		    			"Menu", JOptionPane.PLAIN_MESSAGE,icono1("Pulpo.png",150,150), new Object[] {"Centigrados a Fahrenheit", "Centigrados a Kelvin","Fahrenheit a Centigrados","Kelvin a Centigrados"},
		    			"Selecciona")).toString();
				if (conversor2 == "Centigrados a Fahrenheit") {
					resultado = Math.round(((numConversion * 9/5) + 32) * 100.0) / 100.0;
					JOptionPane.showMessageDialog(null,new JLabel(("Son "+ resultado + " °F."), JLabel.CENTER),"Menu", JOptionPane.PLAIN_MESSAGE);
				}if (conversor2 == "Centigrados a Kelvin") {
					resultado = Math.round((numConversion + 273.15) * 100.0) / 100.0;
					JOptionPane.showMessageDialog(null,new JLabel(("Son "+ resultado + " °K."), JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
				}if (conversor2 == "Fahrenheit a Centigrados") {
					resultado = Math.round(((numConversion - 32) * 5/9) * 100.0) / 100.0;
					JOptionPane.showMessageDialog(null,new JLabel(("Son "+ resultado + " °C."), JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
				}if (conversor2 == "Kelvin a Centigrados") {
					resultado = Math.round((numConversion - 273.15) * 100.0) / 100.0;
					JOptionPane.showMessageDialog(null,new JLabel(("Son "+ resultado + " °C."), JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
				}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,new JLabel("Error. Ingrese un numero.", JLabel.CENTER), "Menu", JOptionPane.PLAIN_MESSAGE);
			}
			
    	}
    	
        ImageIcon icono = new ImageIcon("PulPo.png");
        int resp =JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
                "Menu", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icono);

        String mensaje = "Muchas gracias por usar nuestro conversor";
        String titulo = "Menu";
        switch (resp) {
        case 0:
            Principal msg = new Principal();
        	msg.mensaje();
            break;
        case 1:
        case 2:
        	JOptionPane.showMessageDialog(null,new JLabel(mensaje, JLabel.CENTER), titulo, JOptionPane.PLAIN_MESSAGE);
        }
       
    }       
}
