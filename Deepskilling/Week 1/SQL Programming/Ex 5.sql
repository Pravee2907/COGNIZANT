CREATE OR REPLACE PROCEDURE UpdateSalary(
    id IN NUMBER,
    per IN NUMBER
)
IS
    a NUMBER;
BEGIN

    SELECT COUNT(*)
    INTO a
    FROM Employees
    WHERE EmployeeID = id;

    IF a = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee Not Found');
    END IF;

    UPDATE Employees
    SET Salary = Salary + (Salary * per / 100)
    WHERE EmployeeID = id;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Salary Updated');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
