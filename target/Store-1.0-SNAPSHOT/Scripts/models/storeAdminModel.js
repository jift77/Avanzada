var adminModel = {
    currentView: ko.observable("signin"),
    listMode: ko.observable("products"),
    newProduct: { name: "" },
    errorLogin: ko.observable(false),
    loginMessage: ko.observable("")
}
