// Get user input in Vala
void main()
{
    stdout.printf("Enter name: ");
    string name = stdin.read_line();
    if (name != null)
    {
        stdout.printf("Hello, %s!\n", name);
    }
}