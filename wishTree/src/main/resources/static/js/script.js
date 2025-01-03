
/***********************************************토글메뉴*******************************************************/
function toggleMenu(show) {
    const sideMenu = document.getElementById('sideMenu');
    if (show) {
        sideMenu.style.visibility = 'visible';
        sideMenu.style.opacity = '1';
        sideMenu.classList.add('active');
    } else {
        sideMenu.classList.remove('active');
        sideMenu.style.visibility = 'hidden';
        sideMenu.style.opacity = '0';
    }
}

/*******************************************세션유지*****************************************************/
