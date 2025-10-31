# include <stdio.h>
# include <stdlib.h>

struct Node
{
  int data;
  struct Node * next;
};

struct Node *head = NULL;

void insert(int n)
{
  struct Node * newnode = (struct Node *)malloc(sizeof(struct Node));
  newnode->data = n;
  newnode->next = NULL;

  struct Node * temp = head;

  if(temp==NULL)
  {
    head = newnode;
    return;
  }
  while(temp->next!=NULL)
  {
  temp=temp->next;
  }
    temp->next = newnode;
}

void display()
{
  if(head==NULL)
  {
    printf("The linked list is empty.");
  }
  else
  {
    struct Node * temp = head;
    while(temp!=NULL)
    {      printf("%d ",temp->data);

      temp=temp->next;
    }
  }
}
void insertmid(int n,int pos)
{
  struct Node * newnode = (struct Node *)malloc(sizeof(struct Node));
  newnode->data = n;
  newnode->next = NULL;

  struct Node * temp = head;

  if(head == NULL)
  {
    if(pos!=0)
    {
       printf("The linked list is empty enter valid position");
    }
    else
    {
      head = newnode;
    }

  }
  else
  {
   
    
while(temp != NULL && temp->data != pos)
    {
      temp=temp->next;
    }
    if(temp==NULL)
    {
      printf("The list does not contain the node.");
      return;
    }
    newnode->next = temp->next;
    temp->next=newnode;
  }
}

void delete()
{
  if(head ==NULL)
  {
    printf("The list is empty then cant delete");
  }
  else
  {
    struct Node * temp = head;
    while(temp->next!=NULL)
    {
      temp = temp->next;
    }
    temp=NULL;
  }
}

int main()
{
 insert(10);
 insert(40);
 insert(40);
display();
 insertmid(30,20);
 delete();
display();
 
  return 0;
}