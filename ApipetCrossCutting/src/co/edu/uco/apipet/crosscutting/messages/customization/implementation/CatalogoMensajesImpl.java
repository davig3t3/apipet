package co.edu.uco.apipet.crosscutting.messages.customization.implementation;

import java.util.ResourceBundle;

import co.edu.uco.apipet.crosscutting.messages.customization.CatalogoMensajes;

public class CatalogoMensajesImpl implements CatalogoMensajes{

	private final ResourceBundle bundle = ResourceBundle.getBundle("./co/edu/uco/apipet/crosscutting/messages/customization/catalog/messages");

    @Override
    public String getMessage(String clave) {
        return bundle.getString(clave);
    }
}
