import pytest


def in_range_check(param_one, param_two, param_three):
    if type(param_one) == int and \
            type(param_two) == int and \
            type(param_three) == int:
        return -5 <= param_one <= 5 and \
               -5 <= param_two <= 5 and \
               -5 <= param_three <= 5
    else:
        return False


data_set = [
    (-5, 3, 5),
    (5, 0, 1),
    (1, 2, 3),
]
data_set_two = [
    (-5, 4, 10),
    (-10, -5, 1),
    (4, "Monty", 1),
    (3.14, 0, 5),
    (True, 5, -5),
]


@pytest.mark.parametrize("param_one, param_two, param_three", data_set)
def test_interval_true(param_one, param_two, param_three):
    assert in_range_check(param_one, param_two, param_three)


@pytest.mark.parametrize("param_one, param_two, param_three", data_set_two)
def test_interval_false(param_one, param_two, param_three):
    assert not in_range_check(param_one, param_two, param_three)