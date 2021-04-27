import unittest
import lab6 as system


class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(True, False)

    windows = system.System("windows")

    def test_help_method(self):
        outcome = system.System.help(self.windows, "cd")
        self.assertIsNotNone(outcome)

    def test_desc_method(self):
        outcome = system.System.get_desc(self.windows, "cd")
        self.assertEqual(IndexError, outcome)

    def test_desc(self):
        outcome = system.System.get_desc(self.windows, "cd /d")
        self.assertIsNotNone(outcome)


if __name__ == '__main__':
    unittest.main()
