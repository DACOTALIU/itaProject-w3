/**
 * 
 */
(function() {
    window.onload = function() {
        var login = document.getElementById('login');
        var logout = document.getElementById('logout');
        var order = document.getElementById('order');
        login.onclick = function() {
            window.open('./jsp/loginJsp.jsp');
        };


    }

})();
