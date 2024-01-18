# test_integration.py
import unittest
from manage import capitalize_string
from manage import reverse_string

class TestIntegration(unittest.TestCase):

    def test_integration(self):
        input_string = "hello world"

        # Test de l'intégration entre les deux fonctions
        capitalized_reversed = reverse_string(capitalize_string(input_string))

        self.assertEqual(capitalized_reversed, "dlrow olleh")

if __name__ == '__main__':
    unittest.main()
