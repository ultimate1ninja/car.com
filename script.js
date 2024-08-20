document.getElementById('searchInput').addEventListener('input', function() {
    let filter = this.value.toLowerCase();
    let carCards = document.querySelectorAll('.car-card');

    carCards.forEach(function(card) {
        let title = card.querySelector('.car-title').textContent.toLowerCase();
        if (title.includes(filter)) {
            card.style.display = '';
        } else {
            card.style.display = 'none';
        }
    });
});
