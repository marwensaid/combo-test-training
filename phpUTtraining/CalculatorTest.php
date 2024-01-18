use PHPUnit\Framework\TestCase;

require_once 'Calculator.php';

class CalculatorTest extends TestCase {

    public function testAdd() {
        $calculator = new Calculator();
        $this->assertEquals(5, $calculator->add(2, 3));
        $this->assertEquals(10, $calculator->add(7, 3));
    }

    public function testSubtract() {
        $calculator = new Calculator();
        $this->assertEquals(2, $calculator->subtract(5, 3));
        $this->assertEquals(-4, $calculator->subtract(2, 6));
    }

    public function testMultiply() {
        $calculator = new Calculator();
        $this->assertEquals(15, $calculator->multiply(5, 3));
        $this->assertEquals(-12, $calculator->multiply(2, -6));
    }

    public function testDivide() {
        $calculator = new Calculator();
        $this->assertEquals(4, $calculator->divide(12, 3));
        $this->expectException(InvalidArgumentException::class);
        $calculator->divide(5, 0);
    }
}
