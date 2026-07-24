CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    a IN NUMBER,
    b IN NUMBER,
    amt IN NUMBER
)
IS
    bal NUMBER;
BEGIN

    SELECT Balance
    INTO bal
    FROM Accounts
    WHERE AccountID = a;

    IF bal < amt THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient Balance');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - amt
    WHERE AccountID = a;

    UPDATE Accounts
    SET Balance = Balance + amt
    WHERE AccountID = b;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Amount Transferred');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
