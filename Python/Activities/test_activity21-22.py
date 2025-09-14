import pytest

@pytest.mark.activity
def test_addition():
    num1 = 10
    num2 = 5
    sum = num1+num2
    assert sum==15

@pytest.mark.activity
def test_subtraction():
    num1 = 10
    num2 = 5
    sub = num1 - num2
    assert sub == 5

@pytest.mark.activity
def test_product():
    num1 = 10
    num2 = 5
    mul = num1 * num2
    assert mul == 50
    
@pytest.mark.activity
#@pytest.mark.skip
@pytest.mark.xfail
def test_division():
    num1 = 10
    num2 = 5
    div = num1 / num2
    assert div == 30
