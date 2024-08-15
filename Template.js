const texts = ["Designer, Developer, Freelancer, Photographer"];
let currentIndex = 0;
let index = 0;
const speed = 100; // typing speed in milliseconds

function typeText() {
    if (index < texts[currentIndex].length) {
        document.getElementById("typed-text").innerHTML += texts[currentIndex].charAt(index);
        index++;
        setTimeout(typeText, speed);
    } else {
        setTimeout(resetText, 2000); // wait 2 seconds before resetting the text
    }
}

function resetText() {
    index = 0;
    currentIndex = Math.floor(Math.random() * texts.length); // get a random index for the next text
    document.getElementById("typed-text").innerHTML = '';
    typeText();
}

window.onload = typeText;

$(document).ready(function() {

    $('.counter').each(function () {
    
    $(this).prop('Counter',0).animate({
    
    
    Counter: $(this).text()
    
    
    
    }, {
    
    
    duration: 4000,
    
    
    easing: 'swing',
    
    
    step: function (now) {
    
    
    
    $(this).text(Math.ceil(now));
    
    
    
    }
    
    
    
    });
    
    });
    
    
    });

   