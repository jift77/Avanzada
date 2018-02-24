var sendRequest = function (url, verb, data) {
    var settings = {
        url: url,
        method: verb,
        "headers": {
          "Content-Type" : "application/json"
        },
        data : JSON.stringify(data)
      }
    return $.ajax(settings); 
}

var setDefaultCallbacks = (successCallback, errorCallback) => {
    $.ajaxSetup({
        complete: function (jqXHR, status) {
            if (jqXHR.status >= 200 && jqXHR.status < 300) {
                successCallback(jqXHR.responseJSON);
            } else
                errorCallback(jqXHR.status, jqXHR.statusText );    
        }
    });
}

var setAjaxHeaders = function (requestHeaders) {
    $.ajaxSetup({ headers: requestHeaders });
}