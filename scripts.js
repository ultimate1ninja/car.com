// script.js

document.getElementById('searchInput').addEventListener('keyup', function() {
    let filter = this.value.toUpperCase();
    let carCards = document.getElementsByClassName('car-card');
    
    for (let i = 0; i < carCards.length; i++) {
        let title = carCards[i].getElementsByTagName('h3')[0];
        if (title.innerHTML.toUpperCase().indexOf(filter) > -1) {
            carCards[i].style.display = '';
        } else {
            carCards[i].style.display = 'none';
        }
    }
});
