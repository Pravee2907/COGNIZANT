CREATE OR REPLACE PROCEDURE AddNewCustomer(
    id IN NUMBER,
    n IN VARCHAR2,
    d IN DATE,
    b IN NUMBER
)
IS
    a NUMBER;
BEGIN

    SELECT COUNT(*)
    INTO a
    FROM Customers
    WHERE CustomerID = id;

    IF a > 0 THEN
        RAISE_APPLICATION_ERROR(-20003, 'Customer Already Exists');
    END IF;

    INSERT INTO Customers
    VALUES(id, n, d, b, SYSDATE);

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Customer Added');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
