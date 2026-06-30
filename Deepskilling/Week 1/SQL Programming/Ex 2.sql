DECLARE
    CURSOR c IS
        SELECT CustomerID, Balance
        FROM Customers;
BEGIN

    FOR x IN c LOOP

        IF x.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = x.CustomerID;
        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP Status Updated');
END;
