/* global model, sendRequest, adminModel */

﻿const authenticateUrl = "/store/rest/user/";

var authenticate = (successCallback) => {
    sendRequest(authenticateUrl, "POST", {
        userName: model.username(),
        password: model.password()
    })
    .done((data) => {
        if(data === true)
        {
            model.authenticated(true);
            if (successCallback) successCallback();
        }
        else
        {
            adminModel.loginMessage("Usuario o clave incorrectos");
            adminModel.errorLogin(true);
        }
        }
    )
    .fail((e) => {
        console.log(e);
    });
}; 