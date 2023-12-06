document.addEventListener(DOMContentLoaded, function () {
    // Obtén referencias a los elementos
    var menuIcon = document.getElementById(menu-icon);
    var navMenu = document.getElementById(nav-menu);
    var menuVisible = false;

    // Agrega un evento de clic al icono de menú
    menuIcon.addEventListener(click, function () {
        // Cambia la visibilidad del menú
        menuVisible = !menuVisible;
        navMenu.style.display = menuVisible ? block : none;
    };

    // Obtener el párrafo de "Preguntas Frecuentes"
    var preguntasFrecuentesParagraph = document.getElementById(preguntas-frecuentes-paragraph');
    // Obtener el enlace del menú "Preguntas Frecuentes"
    var preguntasFrecuentesLink = document.getElementById(preguntas-frecuentes-link');

    // Agregar un evento de clic al enlace del menú
    preguntasFrecuentesLink.addEventListener(click, function (event) {
        // Evitar que el enlace lleve a otra página
        event.preventDefault();

        // Mostrar u ocultar el párrafo al hacer clic en el enlace
        preguntasFrecuentesParagraph.style.display = (preguntasFrecuentesParagraph.style.display === none)  block : none;
    };
};