import unittest
from lab6 import System


class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(True, False)

    linux = System("linux")

    def test_help_method(self):
        outcome = System.help(self.linux, "rm")
        self.assertIsNotNone(outcome)

    def test_desc_method(self):
        outcome = System.get_desc(self.linux, "rm")
        self.assertEqual(IndexError, outcome)

    def test_desc(self):
        outcome = System.get_desc(self.linux, "ls -a")
        self.assertIsNotNone(outcome)


if __name__ == '__main__':
    unittest.main()
