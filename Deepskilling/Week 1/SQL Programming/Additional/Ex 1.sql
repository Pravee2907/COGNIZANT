DECLARE
    CURSOR c IS
        SELECT CustomerID, DOB
        FROM Customers;

    a NUMBER;
BEGIN
    FOR x IN c LOOP

        a := TRUNC(MONTHS_BETWEEN(SYSDATE, x.DOB) / 12);

        IF a > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = x.CustomerID;
        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest Rate Updated');
END;
