function validate()
{
    validatePassword($('.passwordTextField').val());
    validateInput($('.numberTextField').val())
}

function setUpHTMLFixture() {

        jasmine.getFixtures().set(' <p> jasmine walidacja </p>  \
                                    <div class="password-strength"></div>    \
                                    <br/>            \
                                    <div class="validate-number"></div>      \
                                    <br/>        \
                                    <input type="text" class="passwordTextField">        \
                                    <br/>        \
                                    <input type="text" class="numberTextField">      \
                                    <br/>        \
                                    <button class="validate" onclick=validate()>Validate</button>              \
                                ');
}

function validatePassword(newPassword)
{
    var len = newPassword.length,
        passwordIndicator = $('.password-strength');

    if (len == 0){
        passwordIndicator.text('')
    }
    else if (len < 6) {
        passwordIndicator.text('nie zostawiaj pola pustego');
    }
    else{
        passwordIndicator.text('za krótkie');   
    }
}

function validateInput(newInput)
{
    var len = newInput.length;
    numberIndicator = $('.validator-number');

    if(len == 0) {
        numberIndicator.text('nie zostawiaj pola pustego');
    }

    else if(isNaN(newInput)) {
        numberIndicator.text('zly numer');
    }
    else {
        numberIndicator.text('');   
    }
}

describe('walidacja hasla', function () {

    var passwordLabel;
    beforeEach(function () {
        setUpHTMLFixture();
        passwordLabel = $('.password-strength');
    });

    it('powinno ostrzegać gdy puste', function () {

        $( ".passwordTextField" ).val('0');
        $(".validator").click();
        expect(passwordLabel).not.toBeEmpty();
    });

    it('powinien ostrzegać, gdy hasło jest mniejsze niż 6 znaków', function () {
        
        $( ".passwordTextField" ).val('abcde');
        $(".validator").click();
        expect(passwordLabel).not.toBeEmpty();
    })
})

describe('walidacja numeru', function () {

    var numberLabel;
    beforeEach(function () {
        setUpHTMLFixture();
        numberLabel = $('.validator-number');
    });

    it('powinien ostrzegać, gdy dane wejściowe są puste', function () {

        $( ".numberTextField" ).val('');
        $(".validator").click();
        expect(numberLabel).not.toBeEmpty();
    });

    it('powinien ostrzegać, gdy dane wejściowe nie są liczbą', function () {

        $( ".numberTextField" ).val('someString');
        $(".validator").click();
        expect(numberLabel).not.toBeEmpty();
    });

    it('nie powinien zgłaszać błędów, jeśli jest poprawny', function () {

        $( ".numberTextField" ).val('');
        $(".validator").click();
        expect(numberLabel).toBeEmpty();
    })
})