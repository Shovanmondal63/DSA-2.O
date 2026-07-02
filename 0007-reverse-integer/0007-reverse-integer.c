int reverse(int x){
    int i;
    long s=0;
    while(x != 0)
    {
        i= x % 10;
        s=(s*10)+i;
        x=x/10;
    }
    if(s > INT_MAX || s < INT_MIN)
    {
        return 0;
    }
    return (int)s;
}
